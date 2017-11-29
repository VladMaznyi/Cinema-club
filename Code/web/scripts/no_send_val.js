window.onload = function init() {
    var elemList = document.getElementsByTagName("input");
    for (var i = 0; i < elemList.length; i++) {
        elemList[i].onblur = function (event) {
            var elem = event.target.getAttribute("name");
            if (elem !== null) {
                if (elem === "email") {
                    if (!event.target.value.match(/^[0-9a-z-\.]+\@[0-9a-z-]{2,}\.[a-z]{2,}$/) ||
                        event.target.value === "")
                        event.target.setAttribute("class", "bad");
                    else
                        event.target.setAttribute("class", "good");

                }
                if (elem === "login") {
                    if (!event.target.value.match(/^[a-zA-Z][a-zA-Z0-9]{5,20}$/))
                        event.target.setAttribute("class", "bad");
                    else
                        event.target.setAttribute("class", "good");

                }
                if (elem === "password") {
                    if (!event.target.value.match(/^[a-zA-Z0-9]{5,20}$/))
                        event.target.setAttribute("class", "bad");
                    else
                        event.target.setAttribute("class", "good");
                }
                if(elem === "passwordToConfirm"){
                    var elem = document.getElementById("password");
                    if (!event.target.value.match(/^[a-zA-Z0-9]{5,20}$/) || elem.value !== event.target.value)
                        event.target.setAttribute("class", "bad");
                    else
                        event.target.setAttribute("class", "good");
                }
            }
        }
    }
};

