

document.getElementById('botao').addEventListener('click', cadastrar);

function cadastrar() {
    event.preventDefault();
    const nome = document.getElementById('nome').value;
    const login = document.getElementById('login').value;
    const senha = document.getElementById('senha').value;
    const cep = document.getElementById('cep').value;
    const telefone = document.getElementById('telefone').value;

    const data = {
        nome: nome,
        login: login,
        senha: senha,
        cep: cep,
        telefone: telefone
    };

    fetch("https://mangahub.up.railway.app/auth/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        //mode: 'no-cors',
        body: JSON.stringify(data)
    })
    .then(response => {
        console.log(response.status);
        // Lógica adicional de tratamento de resposta aqui
        window.location.href = "login.html";
    })
    .catch(error => {
    console.log("Erro ao fazer cadastro");
    });
}