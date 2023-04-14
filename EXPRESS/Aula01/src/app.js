import express from 'express';

const app = express()
app.use(express.json())

const PORT = 8000;
app.listen(PORT, () =>{
    console.log(`Server is running on http://localhost:${PORT}`)
});

const produto = []
let encontrado = []

app.post('/produto/create', (requisicao, resposta) => {
    const body = requisicao.body;
    // const newId = ;
    const prod = {id:produto.length > 0 ? produto[produto.length-1].id + 1 : 1, nome:body.nome, preco:body.preco}
    produto.push(prod)
    console.log(produto)
    return resposta.status(200).json(prod);
});

app.get('/produto/:nome', (requisicao, resposta) =>{
    const { nome } = requisicao.params;
    encontrado = []
    produto.forEach((item)=>{
        if(item.nome.includes(nome)){
            encontrado.push(item)
        }
    })
    if(encontrado.length==0) return resposta.status(404).json({message: "User not found"})

    return resposta.status(200).json(encontrado)

});
app.get('/produto/:id', (requisicao, resposta) =>{
    const { id } = requisicao.params;
    const num = produto.find((item) => {
        return item.id === Number(id)});
    if(!num) return resposta.status(404).json({message: "Product's ID not found"})
    return resposta.status(200).json(num);
});


app.put('/produto/update', (requisicao, resposta) => {
    // /produto/update?email={valor}
    const { id } = requisicao.query;
    const body = requisicao.body;
    const userIndex = produto.findIndex((item) => {
        return item.id === Number (id)});
    if (userIndex === -1) return resposta.status(404).json({message: 'Product not found'})
    produto[userIndex].nome = body.nome
    produto[userIndex].preco = body.preco

    const userUpdate = produto[userIndex]
    return resposta.status(200).json(userUpdate);
})

app.delete('/produto/delete/:nome', (requisicao, resposta)=>{
    const {nome} = requisicao.params;
    const userIndex = produto.findIndex((item) => {
        return item.nome === nome});
    if(userIndex === -1)return resposta.status(404).json({message: 'User not found'})
    produto.splice(userIndex, 1)
    return resposta.status(200).json({message:"User deleted"})
})
