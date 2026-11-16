const Bike = require('../src/Bike')

test("test that the bike is off when created", () => {
    const bike = Bike()

    bike.getPower()
    expect(bike.getPower().toBe(false))

})



