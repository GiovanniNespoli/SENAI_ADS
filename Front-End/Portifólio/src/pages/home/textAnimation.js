var string = "'Bem vindo, ao meu portifólio ${ Giovanni Nespoli }';";
var array = string.split("");
var timer;

function frameLooper() {
    if (array.length > 0) {
        document.getElementById("animation").innerHTML += array.shift();
    } else {
        clearTimeout(timer);
    }
    loopTimer = setTimeout('frameLooper()', 70);
}
frameLooper();