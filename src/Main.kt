class Main {
}

fun String.checkParentheses(): Boolean {
    val stack = Stack<Char>()
    for (character in this) {
        when (character) {
            '(' -> stack.push(character)
            ')' -> if (stack.isEmpty) {
                return false
            } else {
                stack.pop()
            }
        }
    }
    return stack.isEmpty
}

fun makeBeverageTree(): TreeNode<String> {
    val tree = TreeNode("Beverages")
    val hot = TreeNode("hot")
    val cold = TreeNode("cold")
    val tea = TreeNode("tea")
    val coffee = TreeNode("coffee")
    val chocolate = TreeNode("cocoa")
    val blackTea = TreeNode("black")
    val greenTea = TreeNode("green")
    val chaiTea = TreeNode("chai")
    val soda = TreeNode("soda")
    val milk = TreeNode("milk")
    val gingerAle = TreeNode("ginger ale")
    val bitterLemon = TreeNode("bitter lemon")
    tree.add(hot)
    tree.add(cold)
    hot.add(tea)
    hot.add(coffee)
    hot.add(chocolate)
    cold.add(soda)
    cold.add(milk)
    tea.add(blackTea)
    tea.add(greenTea)
    tea.add(chaiTea)
    soda.add(gingerAle)
    soda.add(bitterLemon)
    return tree // root node만 return
}

fun makeBinaryTree(): BinaryNode<Int> {
    val zero = BinaryNode(0)
    val one = BinaryNode(1)
    val five = BinaryNode(5)
    val seven = BinaryNode(7)
    val eight = BinaryNode(8)
    val nine = BinaryNode(9)
    seven.leftChild = one
    one.leftChild = zero
    one.rightChild = five
    seven.rightChild = nine
    nine.leftChild = eight
    val tree = seven
    return tree
}

fun makeAVLTree(): AVLNode<Int> {
    val one = AVLNode(1)
    val seven = AVLNode(7)
    val eight = AVLNode(8)
    val nine = AVLNode(9)
    val eleven = AVLNode(11)
    val ten = AVLNode(10)
    val fifteen = AVLNode(15)
    seven.leftChild = one
    seven.rightChild = nine
    nine.leftChild = eight
    nine.rightChild = eleven
    eleven.leftChild = ten
    eleven.rightChild = fifteen
    return seven
}

typealias Predicate<T> = (T) -> Boolean

fun foo(p: Predicate<Int>) = p(42)


fun main() {
/*    val f: (Int) -> Boolean = {it > 0}
    println(foo(f))

    val p : Predicate<Int> = { it > 0 }
    println(listOf(1, -2).filter(p))*/
    /*var s1 = Smartphone("A32")
    s1.Inner().which_cpu() // 만들어지고 만드어진다
    //Smartphone.Inner().which_cpu() 에러 클래스에서 접근 불가

    Smartphone.Companion.which_cpu()
    // Companion object는 클래스에서 접근 가능
    // s1.Companion.which_cpu() // 에러. 객체에서 접근 불가능

    val outer = Outer()
    Outer.Nested().accessCompanionMethod()*/

    // Nested 클래스 (Outer class에게 접근 불가능

    /*val output = Outer.Nested().greeting()
    println(output)
    val outer = Outer()
    println(outer.outside())

    Outer.Nested().accessCompanionMethod()*/

/*    var f1 = Flower.bud.bloom("Rose")
    var f2 = Flower.bloom("sunflower")
    println(f1)
    println(f2)*/
    /*val queue = ArrayListQueue<String>().apply{
        enqueue("1")
        enqueue("21")
        enqueue("41")
    }
    println("before $queue")
    queue.reverse()
    println("after $queue")*/
/*
    var s = "h((e))llo(world)()"
    println(s.checkParentheses())
    println("(hello world".checkParentheses())
*/

    //stack 반복문
/*    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)
    println(list)

    var s: String = ""
    for (item in list)
        s += " -> ${item * 2}"
    s = s.substring(4)
    println(s)*/
    //AVLTree
    /*var tree = makeAVLTree()
    println(tree)
    println("height: ${tree.height()}")*/


/*    val tree = makeBeverageTree() // root node
//    tree.forEachDepthFirst { println(it.value) }
//    tree.forEachLevelOrder { println(it.value) }
    tree.search("ginger ale")?. let {
        println("Found node: ${it.value}")
    }
    tree.search("WKD Blue")?. let {
        println(it.value)
    } ?: println("Couldn't find WKD Blue")

    val tree2 = makeBinaryTree()
    print(tree2)

    tree2.traverseInOrder { println(it) }

    println(tree2.height())

    val bst = BinarySearchTree<Int>()
    (0..4).forEach {
        bst.insert(it)
    }
    println(bst)*/

    /*var o1: TestDataClass = TestDataClass(3, "Hello, world!")
    println(o1)

    var a = o1.component1()
    println(a)*/

 /*   var o1: TestDataClass = TestDataClass(1, "hi")
    var o2: TestDataClass = TestDataClass(1, "hi")
    o2.c = true

    println(o1.equals(o2))
    println(o2)*/

   /* var o1: TestAbstClass = ChildOfAbstClass1()
    println(o1)
    println(o1.f1())
    println(o1.f2()) // ?
    var o2: TestAbstClass = ChildOfAbstClass2()
    println(o2)
    println(o2.f1())
    println(o2.f2())
    var o3 = ChildOfAbstClass1()
    println(o3)
    println(o3.f1())
    println(o3.f2())
    println(o3.f3())
    var o4 = o3 as TestAbstClass
    println(o4)
    println(o4.f1())
    println(o4.f2()) // why?*/

    /*var o1: ChildOfInterface = ChildOfInterface(10)
    println(o1)
    println(o1.f1())
    println(o1.f2("A"))
    println(o1.f3("B"))
    println(o1.f4())*/

    /*var c1 = Cat(name="Tom", age=30)
    c1.talk()*/
    /*var tc = Man("Kevin", 23, "Student")
    println(tc)
    println(tc.age)
    println(tc.job)
    println(tc.address)
    println(tc.strength)

    tc.address = "Earth"
    println(tc.address)

    tc.cursed = true
    println(tc.speed)*/
    var list = LinkedList<Int>()
    list.append(10).append(20).append(30)
    println(list.getMiddle()?.value)
}