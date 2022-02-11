
function getValue() {

    let value = ''
    //get
    document.getElementById('userName').addEventListener('input', function (e) {
        //Get the text via event object , target property returns the reference of text
        let textBox = e.target
        // console.dir(textBox.value)
        value = textBox.value
    })
    document.getElementById('btn').addEventListener('click', function (e) {
        alert(value)
        document.getElementById('showText').innerHTML = value;
    })
}
getValue();