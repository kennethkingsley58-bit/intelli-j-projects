const AirConditioner = require('../src/Ac')

test("test That the Ac TurnOn", () => {
    const ac = AirConditioner()

    ac.turnOn()

    expect(ac.isAcOn()).toBe(true)

})


test("test that the Ac TurnOff", () => {
    const ac = AirConditioner()

    ac.turnOn()
    ac.turnOff()

    expect(ac.isAcOn()).toBe(false)

})

test("test that the Ac is increased", () => {
    const ac = AirConditioner()
    
    ac.turnOn()
    ac.increaseAcTemperature()
    
    expect(ac.increaseAcTemperature()).toBe(18)

})

test("test that the Ac is Decreased", () => {
    const ac = AirConditioner()
    
    ac.turnOn()
    ac.increaseAcTemperature()
    // ac.decreaseAcTemperature()
    expect(ac.decreaseAcTemperature()).toBe(16)

})

test("test that the temperature should not be beyond thirty", () =>{
    const ac = AirConditioner()

    for(let index = 0; index < 10; index++){
        ac.increaseAcTemperature();
    }

    ac.turnOn()
    ac.increaseAcTemperature()

    expect(ac.increaseAcTemperature()).toBe(28)

})

test("test that the temperature should not be less than sixteen", () => {
    const ac = AirConditioner()

    for(let index = 0; index < 4; index++){
        ac.decreaseAcTemperature()
    }

    ac.turnOn()
    ac.decreaseAcTemperature()

    expect(ac.decreaseAcTemperature()).toBe(16)
})
