fun main(){

    var dot1 = Point(2.0F, -3.2F)
    var dot2 = Point(2.0F, 3.2F)

    println(dot1)
    dot1.symmetryXAxis()
    println(dot1)

    println(dot1 == dot2)

}

class Point (private var X: Float, private var Y: Float)
{

    override fun toString(): String {
        return "X coordinate is $X and Y coordinate is $Y"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Point){
            return other.X == this.X && other.Y == this.Y
        }
        return false;
    }

    fun symmetryXAxis(){
        Y *= -1;
    }
}