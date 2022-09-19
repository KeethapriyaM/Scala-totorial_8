case class Point(var x: Int, var y: Int) {
    def add(p:Point) = new Point(this.x + p.x, this.y + p.y)

    def move(x:Int, y:Int):Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }

    def distance(p:Point) : Double = {
        var dx:Int = this.x - p.x
        var dy:Int = this.y - p.y
        var dist: Int = dx*dx + dy*dy
        scala.math.sqrt(dist)
    }

    def invert() :Unit = {
        var tmp = this.x
        this.x = this.y
        this.y = tmp
    }
}

object Q1 extends App {

    var point1 = Point(4,7)
    var point2 = Point(10,8)
    println("\nAdd two given points")
    println("point1 + point2 : " + point1.add(point2))

    point1.move(x = 3, y = 1)
    point2.move(x = 1, y = 2)
    println("\nMove a point by a given distance")
    println("Point 1 : " + point1)
    println("Point 2 : " + point2)
    
    println("\nDistance between two given points : ")
    var distance = point1.distance(point2)
    println("Distance : " + distance)

    println("\nInvert the x and y coordinates")
    point1.invert()
    println("Point 1 : " + point1)
}