function AirConditioner(){
    let isOn = false;
    let acTemperature = 16
    function turnOn(){
        isOn = true
    }

    function turnOff(){
        isOn = false
    }

    function isAcOn(){
        return isOn
    }

    function isAcOff(){
        return !isOn
    }
    
    function increaseAcTemperature(){      
        if(acTemperature < 30){
            acTemperature++
        }
        return acTemperature
    }

    function decreaseAcTemperature(){ 
        if(acTemperature > 16){
            acTemperature--
        }
        return acTemperature
    }

    return {
        turnOn,
        turnOff,
        isAcOn,
        isAcOff,
        increaseAcTemperature,
        decreaseAcTemperature
    }
}

module.exports = AirConditioner