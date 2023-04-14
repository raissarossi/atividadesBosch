from core.configs import settings
from core.database import engine

async def create_tables() -> None:
    import models.__all_models
    print('Criando as tabelas do DB...')
    #criar um bloco de contexto assíncrono

    async with engine.begin() as conn:
        await conn.run_sync(settings.DBBaseModel.drop_all)
        await conn.run_sync(settings.DBBaseModel.create.all)

    print('Tabelas criadas com sucesso...')

if __name__=='__main__':
    import asyncio
    asyncio.run(create_tables())