function changeColor() {
    
    //get Element
    let heading = document.getElementById('hello')
    //add event listner
    heading.addEventListener('mouseenter', function () {
        //apply the background color
        heading.style.backgroundColor = 'yellow'
        heading.style.fontSize = '50px'
    });
    heading.addEventListener('mouseleave', function () {
        //apply the background color
        heading.style.backgroundColor = null;
        heading.style.fontSize = null
    });
}

//add window.onload method

window.addEventListener('load', function () {
   changeColor()
})


