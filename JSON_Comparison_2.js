
var obj1 = {
    "data": {
        "id": 2,
        "email": "janet.weaver@reqres.in",
        "first_name": "Janet",
        "last_name": "Weaver",
        "avatar": "https://reqres.in/img/faces/2-image.jpg"
    },
    "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }
    
}

var obj2 = {
    "data": {
        "id": 2,
        "first_name": "Janete",
        "last_name": "Weaver",
        "email": "janet.weaver@reqres.in",
        "avatar": "https://reqres.in/img/faces/2-image.jpg"
    },
    "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }
}
var Key;
console.log(checkObject(obj1, obj2));

function checkObject(obj1, obj2){
    
    
    // Strick Check
    if(obj1 === obj2){
        return true;
    }

    // Check if the objects are both objects

    if(typeof obj1 !== 'object' || typeof obj2 !== 'object'){
        return false;
    }

    // Get the keys of both objects
    const keys1 = Object.keys(obj1);
    const keys2 = Object.keys(obj2);

    //if(keys1.length !== keys2.length){
      //  return false;
    //}

    // Recursion

    for(const key of keys1){
       // Key = key;
        if(!keys2.includes(key) || !checkObject(obj1[key], obj2[key])){
            //console.log("Mismatch in Key - "+ Key);
            return false;
        }
    }

    return true;
}