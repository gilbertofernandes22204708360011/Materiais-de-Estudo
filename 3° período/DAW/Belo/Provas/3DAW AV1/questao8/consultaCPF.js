$(document).ready(function() {
    $("#consultar").click(function() {
        var cpf = $("#cpf").val();
        var mensagemErro = $("#mensagemErro");
        var spanNome = $("#nome");
        var spanStatus = $("#status");

        mensagemErro.text("");
        spanNome.text("");
        spanStatus.text("");
        spanStatus.css("color", ""); 

        var cpfValido = /^\d{11}$/;
        if (!cpfValido.test(cpf)) {
            mensagemErro.text("CPF incorreto");
            return;
        }

        $.ajax({
            url: "consultarCPF.php",
            type: "GET",
            data: { cpf: cpf },
            dataType: "json",
            success: function(data) {

                spanNome.text(data.nome);
                spanStatus.text(data.status);

                if (data.status === "ATIVO") {
                    spanStatus.css("color", "green");
                } else if (data.status === "INATIVO") {
                    spanStatus.css("color", "red");
                }
            },
            error: function() {
                mensagemErro.text("Erro ao consultar o CPF.");
            }
        });
    });
});