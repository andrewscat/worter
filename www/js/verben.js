var verbList = getVerbs() ;
var currentElement = getRandomElement(verbList);

function getJSON(url) {
  var resp = '';
  var xmlHttp = new XMLHttpRequest();

  if (xmlHttp != null) {
    xmlHttp.open( "GET", url, false );
    xmlHttp.send( null );
    resp = xmlHttp.responseText;
  }
   
  return resp ;
}

function getVerbs() {
  var verbenUrl = '/verben.json';
  return JSON.parse(getJSON(verbenUrl));
}

function newVerb() {
  currentElement = getRandomElement(verbList);
}

function getRandomElement(items) {
  return items[Math.floor(Math.random()*items.length)];
}

function nextVerb() {
  hideAll();
  newVerb();
  translation = document.getElementById("translation");
  translation.textContent = currentElement.translation;
}

function showVerb() {
  hideAll();
  verb = document.getElementById("verb");
  verb.textContent = currentElement.verb;
  verb.setAttribute("class", "visible"); 
}

function showPrateritum() {
  prat = document.getElementById("prateritum");
  prat.textContent = currentElement.prateritum;
  prat.setAttribute("class", "visible"); 
}

function showPerfect() {
  perfect = document.getElementById("perfect");
  perfect.textContent = currentElement.perfect;
  perfect.setAttribute("class", "visible"); 
}

function showHilfsVerb() {
  hilfsVerb = document.getElementById("hilfsVerb");
  hilfsVerb.textContent = currentElement.hilfsVerb;
  hilfsVerb.setAttribute("class", "visible"); 
}

function showAll() {
  showVerb();
  showPrateritum();
  showHilfsVerb();
  showPerfect();
  //showUsage();
}

function hideAll() {
  itemsIds = ["verb", "prateritum", "hilfsVerb", "perfect"];
  for (i in itemsIds) {
    item = document.getElementById(itemsIds[i]);
    item.setAttribute("class", "invisible");
  }
  hideUsage();
}

function hideUsage() {
  var usgDiv = document.getElementById('usage');
  while (usgDiv.firstChild) {
    usgDiv.removeChild(usgDiv.firstChild);
  }
  usgDiv.setAttribute("class", "invisible"); 
}

function showUsage() {
  var usgDiv = document.getElementById('usage');
  var usageItems = currentElement.usage;

  var usgText = document.createElement("strong");
  usgText.textContent = "Usage:";
  usgDiv.appendChild(usgText);
  
  for (i in usageItems) {
    var newDiv = document.createElement('div');
    newDiv.textContent = usageItems[i];
    usgDiv.appendChild(newDiv)
  }

  usgDiv.setAttribute("class", "visible"); 
}