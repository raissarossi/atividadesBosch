from fastapi import FastAPI, HTTPException, status, Path, Query, Header, Depends
from models import Curso
from typing import Optional, Any, Dict
from time import sleep

#from fastapi.responses import JSONResponse
from fastapi import Response

app = FastAPI(
    title='API da ETS!',
    version='1.0',
    description='API desenvolvida em aula',
)
cursos = {
    1: {
        "id" : 1,
        "nome": "Python First Semester",
        "aulas": 20,
        "horas": 80,
        "instrutor": "Cleber"
    },
    2: {
        "id" : 2,
        "nome": "Java Third Semester",
        "aulas": 15,
        "horas": 60,
        "instrutor": "Leonardo"
    }
}
@app.get('/cursos', description='Retorn all courses or an empty list', summary='Return all!', response_model=Dict[int, Curso])
async def get_cursos():
    return cursos

@app.get('/cursos/{curso_id}')
async def get_curso(curso_id : int = Path(default=None, title='Course ID', description='Must be between 1 and 2', gt=0, lt=3)):
    try:
        curso = cursos[curso_id]
        curso.update({"id": curso_id})
        return curso
    except KeyError:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail='Course not found')

@app.post('/cursos', status_code=status.HTTP_201_CREATED, response_model=Curso)
async def post_curso(curso: Curso):
    k = None
    for key, value in cursos.items():
        k = key
    next_id = k + 1
    if next_id not in cursos:
        cursos[next_id] = curso
        cursos[next_id].id = next_id
        #del curso.id
        return curso
    else:
        raise HTTPException(status_code=status.HTTP_409_CONFLICT, detail=f"A course with the {curso.id} ID already exists")

@app.put('/cursos/{curso_id}')
async def put_curso(curso_id: int, curso: Curso):
    if curso_id in cursos:
        cursos[curso_id] = curso
        del curso.id
        return curso
    else:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="This course does not exist.")

@app.delete('/cursos/{curso_id}')
async def delete_curso(curso_id: int):
    if curso_id in cursos:
        del cursos[curso_id]
        return Response(status_code = status.HTTP_204_NO_CONTENT)
        #return JSONResponse(status_code = status.HTTP_204_NO_CONTENT)
    else:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="This course does not exist.")

@app.get('/calculadora')
async def calcular(a:int, b:int, x_test: str = Header(default=None), c:Optional[int] = 0):

    soma = a + b + c
    print(f'X_TEST: {x_test}')
    return {'Resultado: ': soma}

def fake_db():
    try:
        print('Opening connection to database')
        sleep(1)
    finally:
        print('Closing connection to database')
        sleep(1)

async def get_cursos(db: Any = Depends(fake_db)):
    return cursos


if __name__ == '__main__':
    import uvicorn
    uvicorn.run("main:app", host='127.0.0.1', port=8000, reload=True)
