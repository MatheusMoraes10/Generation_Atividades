let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('textarea#assunto')
let nomeOK = false
let emailOK = false
let assuntoOK = false
let mapa = document.querySelector('#mapa')

nome.style.width = '100%'
email.style.width = '100%'

function validaNome() {
    let txtNome = document.querySelector('#txtNome')

    if (nome.value.length < 3) {
        txtNome.innerHTML = 'Nome Inválido'
        txtNome.style.color = 'red'
        nomeOK = false
    } else {
        txtNome.innerHTML = 'Nome Válido'
        txtNome.style.color = 'green'
        nomeOK = true
    }
}

function validaEmail() {
    let txtEmail = document.querySelector('#txtEmail')

    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        txtEmail.innerHTML = 'Email Inválido'
        txtEmail.style.color = 'red'
        emailOK = false
    } else {
        txtEmail.innerHTML = 'Email Válido'
        txtEmail.style.color = 'green'
        emailOK = true
    }
}

function validaAssunto() {
    let txtAssunto = document.querySelector('#txtAssunto')

    if (assunto.value.length >= 100) {
        txtAssunto.innerHTML = 'Texto inválido, ele pode ter no máximo 100 caracteres!!'
        txtAssunto.style.color = 'red'
        txtAssunto.style.display = 'block'
        assuntoOK = false
    } else {
        txtAssunto.style.display = 'none'
        assuntoOK = true
    }
}

function enviar() {

    if (nomeOK == true && emailOK == true && assuntoOK == true) {
        alert('formulario enviado com sucesso!!')
    } else {
        alert('formulario Inválido verifique os campos!!')
    }
}

function mapaZoom() {
    mapa.style.height = "800px"
    mapa.style.width = "600px"
}

function mapaNormal() {
    mapa.style.height = "400px"
    mapa.style.width = "300px"
}