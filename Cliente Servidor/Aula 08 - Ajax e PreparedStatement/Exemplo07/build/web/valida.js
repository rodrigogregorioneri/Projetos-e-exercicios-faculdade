// caracteres brancos
var brancos = " \t\n\r";
var separadores = "-./";
var estados = "AC|AL|AM|AP|BA|CE|DF|ES|GO|MA|MG|MS|MT|PA|PB|PE|PI|PR|RJ|RN|RO|RR|RS|SC|SE|SP|TO";
 
// fVazio retorna verdadeiro se o campo &eacute; nulo ou de tamanho zero
function fVazio (s) {  
 
   return ((s == null) || (s.length == 0))
}
 
// fBranco retorna verdadeiro se string vazio ou cont&eacute;m apenas brancos
function fBranco (s) {   
   var i;
 
   // Vazio?
   if (fVazio(s)) return true;
 
   // Procura nao-brancos no string
   for (i = 0; i < s.length; i++) {   
      // Testa o caractere atual
      var c = s.charAt(i);
      if (brancos.indexOf(c) == -1) return false;
   }
 
   // Todos caracteres sao brancos
   return true;
}
 
// Valida data com 10 caracteres: dd/mm/aaaa
function fDataValida(data){
   var err=0;
   if (data.length != 10) {
      err=1;
   }
 
   dia     = data.substring(0, 2); // dia
   barra_1 = data.substring(2, 3); // '/'
   mes     = data.substring(3, 5); // mes
   barra_2 = data.substring(5, 6); // '/'
   ano     = data.substring(6, 10); // ano
 
   //check de erros b&aacute;sicos
   if (mes<1 || mes>12) err = 1;
   if (barra_1 != '/') err = 1;
   if (dia<1 || dia>31) err = 1;
   if (barra_2 != '/') err = 1;
   if (ano<1900 || ano>2999) err = 1;
 
   // meses com 30 dias
   if (mes==4 || mes==6 || mes==9 || mes==11){
      if (dia==31) err=1;
   }
 
   // tratamento para fevereiro
   if (mes==2){
      var aux=parseInt(ano/4);
      if (isNaN(aux)) {
         err=1;
      }
 
      if (dia>29) err=1;
      if (dia==29 && ((ano/4)!=parseInt(ano/4))) err=1;
   }
 
   if (err==1){
      return false;
   } else {
      return true;
   }
}
 
// Valida email - formato: a@b.c
function fEmailValido (s) {   
 
   // testa vazio
   if (fVazio(s)) return false;
 
   // s branco?
   if (fBranco(s)) return false;
 
   // deve haver 1 ou mais caractere antes do @
   var i = 1;
   var sLength = s.length;
 
    // procura @
   while ((i < sLength) && (s.charAt(i) != "@")) {
      i++
   }
 
   if ((i >= sLength) || (s.charAt(i) != "@")) return false;
   else i += 2;
 
   // procura .
   while ((i < sLength) && (s.charAt(i) != ".")) { 
      i++
   }
 
   // pelo menos 1 caractere depois do .
   if ((i >= sLength - 1) || (s.charAt(i) != ".")) return false;
   else return true;
}
 
function fRemoveSep(s) {
 
   var sNovo = "";
 
   // Procura nao-separadores no string
   for (i = 0; i < s.length; i++) {   
      // Testa o caractere atual
      var c = s.charAt(i);
      if (separadores.indexOf(c) == -1) sNovo += c;
   }
   return (sNovo);
}
 
// fDigito retorna verdadeiro se c for digito
function fDigito (c)
{   return ((c >= "0") && (c <= "9"))
}
 
function fCEPValido(s) {
 
   var i;
   var cepdigitos = fRemoveSep(s);
 
   // Vazio?
   if (fVazio(cepdigitos)) return false;
 
   // 5 ou 8 digitos?
   if (cepdigitos.length != 5 && cepdigitos.length != 8) return false; 
 
   // Procura nao-digitos no string
   for (i = 0; i < cepdigitos.length; i++) {   
      // Testa o caractere atual
      if (!fDigito(cepdigitos.charAt(i))) return false;
   }
 
   // Todos caracteres sao digitos
   return true;
}
 
function fEstadoValido(s) {
 
   if (fVazio(formulario.estado.value) 
      || fBranco(formulario.estado.value)) return false;
 
   if (estados.indexOf(s) == -1) return false;
 
   return true;
 
}
 
 
 
function fValidaForm() {
 
   if (fVazio(formulario.nome.value) || fBranco(formulario.nome.value)) {
      alert('Nome não pode estar em branco');
      formulario.nome.focus();
      return false;
   }
 
   if (!fEmailValido(formulario.email.value)) {
      alert('Email deve ser válido e não pode estar em branco');
      formulario.email.focus();
      return false;
   }
 
   if (!fCEPValido(formulario.cep.value)) {
      alert('CEP deve ter 5 ou 9 caracteres \nno formato 99999-999');
      formulario.cep.focus();
      return false;
   }
 
   if (!fEstadoValido(formulario.estado.value)) {
      alert('Estado invalido');
      formulario.estado.focus();
      return false;
   }
 
   return true;
 
} 