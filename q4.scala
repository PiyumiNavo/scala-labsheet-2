@main def main():Unit = {
    println(calculateProfit(15))
}

val performanceCost: Double = 500

def calculateProfit(ticketPrice:Double):Double = income(ticketPrice) - totalCost(noOfAttendees(ticketPrice))

def noOfAttendees(ticketPrice:Double):Int = (180 - 4*ticketPrice).toInt

def totalCost(attendeeCount:Int):Double = attendeeCost(attendeeCount:Int) + performanceCost

def attendeeCost(attendeeCount:Double):Double = 3 * attendeeCount

def income(ticketPrice:Double):Double = ticketPrice * noOfAttendees(ticketPrice)