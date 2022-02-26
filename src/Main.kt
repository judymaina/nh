fun main(){
    var school = "Akirachix"
    var char1 = school[0]
    var char3 = school[2]
    var char4= school[3]
    var result ="$char1$char3$char4"
    println(result)
    var doc=par("Judy",19)
    println(doc)

    var string="Wainaina"
    println("The lenght of my name is "+string.length)

    var shee="Joy"
    if (shee=="roy")
        println("Thats me")
    else{
        println("thats not me")
    }
}
fun par(name:String,age:Int):String{
  var pet="Hi,my name is $name and i am $age years old"
     return pet
}

