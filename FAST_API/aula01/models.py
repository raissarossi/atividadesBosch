from typing import Optional
from pydantic import BaseModel, validator

class Curso(BaseModel):
    id: Optional[int] = None
    nome: str
    aulas: int
    horas: int
    instrutor: str

    @validator('titulo')
    def validar_titulo(cls, value):
        palavras = value.split(' ')
        if len(palavras)<3:
            raise ValueError('Title must be at least 3 words')
        return value