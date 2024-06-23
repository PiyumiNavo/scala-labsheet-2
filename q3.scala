@main def main():Unit = {
    println(takeHomeSalary(40,30))
}

def takeHomeSalary(workingHrs:Int,OTHrs:Int):Double = {
    if (workingHrs >= 40 && OTHrs >= 30 )
         Salary(workingHrs:Int,OTHrs:Int) - Tax(Salary(workingHrs:Int,OTHrs:Int))
    else 
        Salary(workingHrs:Int,OTHrs:Int)
}

def Salary(workingHrs:Int,OTHrs:Int):Double = workingPay(workingHrs) + OTPay(OTHrs)

def workingPay(workingHrs:Int):Double = workingHrs * 250

def OTPay(OTHrs:Int):Double = OTHrs * 85

def Tax(salary:Double):Double = salary * 0.12

