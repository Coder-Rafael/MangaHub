let autenticado = false;

document.forms["login"].addEventListener('submit', function(event) {
    event.preventDefault(); // Impede o envio do formulário padrão
  
    // Recupera os valores dos campos de entrada
    const login = document.forms["login"]["email"].value;
    const senha = document.forms["login"]["password"].value;
  
    //requisição usando fetch:
    fetch("https://mangahub.up.railway.app/auth/login", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({login, senha}),
    })
    .then(response => response.json())
    .then(data => {
      let = autenticado = true;
      //Manipular a resposta do servidor
      const token = data.token;
      localStorage.setItem('token', token);
      
      window.location.href = "index.html";
    })

    .catch(error => {
      alert("Login Inválido")
    })
  });