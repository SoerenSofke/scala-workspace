@main 
def main() : Unit = 
    print("\u001bc")

    while (true)
        print("\u001B[H")
        println("█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀")
        println("█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀")
        println("█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀")
        println("█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀")
        println(helpers.factorial(6))
              
        Thread.sleep(200)

        print("\u001B[H")
        println("▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█")
        println("▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█")
        println("▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█")
        println("▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█▄▀█")
        println(helpers.factorial(5))

        Thread.sleep(200)
