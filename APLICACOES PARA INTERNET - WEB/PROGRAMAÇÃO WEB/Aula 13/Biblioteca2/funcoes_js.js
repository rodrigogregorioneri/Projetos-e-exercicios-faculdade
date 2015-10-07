$(function(){
    $("body").css("font-family", "Arial")
    $("body").css("font-size", "13pt");
    $("#tab2").css("display", "none");

        
    $("#menu").menu();
    
    $("#btn1").click(function(){
        $("#tab2").hide();
        $("#titulo").hide();
        $("#tab2").css("display", "none");
    });
    $("#btn2").click(function(){
        $("#tab1").hide();
        $("#titulo").hide();
        $("#tab2").css("display", "inline");
    });
    
    
    $("#btn1").click(function(){
        $("#tab1").show();
        $("#titulo").show();
        $("#titulo").text("Dados do Acervo da Biblioteca");
            $("#titulo").css("padding", "10px");
            $("#titulo").css("font-size", "20pt");
            $("#titulo").css("font-weight", "bold");

       str = "<table border='2' id='tabela'><tr class='linha1'> <td>TÍTULO</td> <td>AUTOR</td> <td>EDIÇÃO</td> <td>ANO PUB.</td> <td>EDITORA</td> <td>LOCAL</td> <td>CLASSIFICAÇÃO</td> <td>CÓDIGO</td> <td>ASSUNTO</td> </tr>";
        
        x = acervo.length;
        
        for(i=0; i<x; i++){
            str += "<tr class='trs'> <td>" + acervo[i].titulo + "</td> <td>" + acervo[i].autor + "</td> <td>" + acervo[i].edicao + "</td> <td>" + acervo[i].anopub + "</td><td>" + acervo[i].editora + "</td> <td>" + acervo[i].localpub + "</td><td>" + acervo[i].classificacao + "</td> <td>" + acervo[i].codigo + "</td> <td>" + acervo[i].assunto + "</td></tr>";
        }
        str+= "</table>";
        $("#tab1").html(str);
        
        $("#tabela").css("border", "2px solid green");
        $("#tabela").css("width", "auto");
        
        
        $(".linha1").css("background-color", "yellow");
        $(".linha1").css("font-weight", "bold");
        $(".trs").css("background-color", "#c5eb70");
        
        
    });
    
    
    
    $("#btn2").click(function(){
        $("#tab2").accordion();
        
        $("#tab2").show();
        $("#titulo").show();
        $("#titulo").text("Dados do Acervo da Biblioteca, por gênero");
            $("#titulo").css("padding", "10px");
            $("#titulo").css("font-size", "20pt");
            $("#titulo").css("font-weight", "bold");
        
        str = "<table border='2' id='tabela'><tr class='linha1'> <td>TÍTULO</td> <td>AUTOR</td> <td>EDIÇÃO</td> <td>ANO PUB.</td> <td>EDITORA</td> <td>LOCAL</td> <td>CLASSIFICAÇÃO</td> <td>CÓDIGO</td> <td>ASSUNTO</td> </tr>";
        
        x = acervo.length;
        
        for(i=0; i<x; i++){
            if(acervo[i].classificacao == "poesia"){
            str += "<tr class='trs'> <td>" + acervo[i].titulo + "</td> <td>" + acervo[i].autor + "</td> <td>" + acervo[i].edicao + "</td> <td>" + acervo[i].anopub + "</td><td>" + acervo[i].editora + "</td> <td>" + acervo[i].localpub + "</td><td>" + acervo[i].classificacao + "</td> <td>" + acervo[i].codigo + "</td> <td>" + acervo[i].assunto + "</td></tr>";
            }
        }
        str+= "</table>";
        $("#poesia").html(str);
       
        str = "<table border='2' id='tabela'><tr class='linha1'> <td>TÍTULO</td> <td>AUTOR</td> <td>EDIÇÃO</td> <td>ANO PUB.</td> <td>EDITORA</td> <td>LOCAL</td> <td>CLASSIFICAÇÃO</td> <td>CÓDIGO</td> <td>ASSUNTO</td> </tr>";
        for(i=0; i<x; i++){
            if(acervo[i].classificacao == "romance"){
            str += "<tr class='trs'> <td>" + acervo[i].titulo + "</td> <td>" + acervo[i].autor + "</td> <td>" + acervo[i].edicao + "</td> <td>" + acervo[i].anopub + "</td><td>" + acervo[i].editora + "</td> <td>" + acervo[i].localpub + "</td><td>" + acervo[i].classificacao + "</td> <td>" + acervo[i].codigo + "</td> <td>" + acervo[i].assunto + "</td></tr>";
            }
        }
        str+= "</table>";
        $("#romance").html(str);
        
        str = "<table border='2' id='tabela'><tr class='linha1'> <td>TÍTULO</td> <td>AUTOR</td> <td>EDIÇÃO</td> <td>ANO PUB.</td> <td>EDITORA</td> <td>LOCAL</td> <td>CLASSIFICAÇÃO</td> <td>CÓDIGO</td> <td>ASSUNTO</td> </tr>";
        for(i=0; i<x; i++){
            if(acervo[i].classificacao == "ação"){
            str += "<tr class='trs'> <td>" + acervo[i].titulo + "</td> <td>" + acervo[i].autor + "</td> <td>" + acervo[i].edicao + "</td> <td>" + acervo[i].anopub + "</td><td>" + acervo[i].editora + "</td> <td>" + acervo[i].localpub + "</td><td>" + acervo[i].classificacao + "</td> <td>" + acervo[i].codigo + "</td> <td>" + acervo[i].assunto + "</td></tr>";
            }
        }
        str+= "</table>";
        $("#acao").html(str);
        
        str = "<table border='2' id='tabela'><tr class='linha1'> <td>TÍTULO</td> <td>AUTOR</td> <td>EDIÇÃO</td> <td>ANO PUB.</td> <td>EDITORA</td> <td>LOCAL</td> <td>CLASSIFICAÇÃO</td> <td>CÓDIGO</td> <td>ASSUNTO</td> </tr>";
        for(i=0; i<x; i++){
            if(acervo[i].classificacao == "drama"){
            str += "<tr class='trs'> <td>" + acervo[i].titulo + "</td> <td>" + acervo[i].autor + "</td> <td>" + acervo[i].edicao + "</td> <td>" + acervo[i].anopub + "</td><td>" + acervo[i].editora + "</td> <td>" + acervo[i].localpub + "</td><td>" + acervo[i].classificacao + "</td> <td>" + acervo[i].codigo + "</td> <td>" + acervo[i].assunto + "</td></tr>";
            }
        }
        str+= "</table>";
        $("#drama").html(str);
        
        str = "<table border='2' id='tabela'><tr class='linha1'> <td>TÍTULO</td> <td>AUTOR</td> <td>EDIÇÃO</td> <td>ANO PUB.</td> <td>EDITORA</td> <td>LOCAL</td> <td>CLASSIFICAÇÃO</td> <td>CÓDIGO</td> <td>ASSUNTO</td> </tr>";
        for(i=0; i<x; i++){
            if(acervo[i].classificacao == "filme"){
            str += "<tr class='trs'> <td>" + acervo[i].titulo + "</td> <td>" + acervo[i].autor + "</td> <td>" + acervo[i].edicao + "</td> <td>" + acervo[i].anopub + "</td><td>" + acervo[i].editora + "</td> <td>" + acervo[i].localpub + "</td><td>" + acervo[i].classificacao + "</td> <td>" + acervo[i].codigo + "</td> <td>" + acervo[i].assunto + "</td></tr>";
            }
        }
        str+= "</table>";
        $("#filme").html(str);
        
        
        $("#tabela").css("border", "2px solid green");
        $(".linha1").css("background-color", "yellow");
        $(".linha1").css("font-weight", "bold");
        $(".trs").css("background-color", "#c5eb70");
        
    });
    
    
    });//fim===============