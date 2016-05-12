<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cerca utente from Database</title>
        <script>
            function cerca() {
                var nomeUtente = document.getElementById("nomeUtente").value;
                var req = new XMLHttpRequest();
                var url = "./cercare?nomeUtente=" + nomeUtente;
                req.onreadystatechange = function () {
                    if (req.readyState === 4 && req.status === 200) {
                        document.getElementById("risultato").innerHTML = req.responseText;
                    }
                }
                req.open("GET", url, true);
                req.send();
            }          
        </script>
    </head>
    <body>
        <label> Inserisci il nome dell'utente </label>
        <input class="text" id="nomeUtente" name="" onkeyup="cerca()"/>
        <div id="risultato"></div>
    </body>
</html>
