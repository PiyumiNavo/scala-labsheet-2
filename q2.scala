@main def main():Unit = {
    var a:Int = 2
    var b:Int = 3
    var c:Int = 4
    var d:Int = 5
    var k:Float = 4.3f
    var g:Float = 4.0f
    b -= 1
    println( b* a + c *d)
    d -= 1
    println(a)
    a += 1
    println (-2 * ( g - k ) +c)
    // println (c=c++) // this line will output the same value of the c. Since c++ is returning the old value of c to the c this line looks like c = c
    c = (c+1) * a
    a += 1
    print(c)
    // println (c=++c*a++)
}