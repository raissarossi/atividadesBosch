from pydantic import BaseSettings
from sqlalchemy.ext.declarative import declarative_base

class Settings(BaseSettings):

    API_V1_STR: str='/api/v1' #não precisar inserir via hard coding
    DB_URL: str='mysql+asyncmy://root@127.0.0.1:/etscursos'#ideal user:password
    DBBaseModel = declarative_base() #serve para que os models herdem todos os recursos do sqlalchemy
    class Config:
        case_sensitive=True
settings=Settings () #declarando a variável aqui, em qualquer lugar que
#eu importar o arquivo terei acesso a essas configurações!