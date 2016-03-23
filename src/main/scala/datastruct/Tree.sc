import datastruct.Branch
import datastruct.Leaf
import datastruct.Tree

val simple = Branch(Leaf(1), Leaf(2))
val complex = Branch(Leaf(10), Branch(Leaf(1), Leaf(2)))

Tree.size(simple)
Tree.maximum(complex)
Tree.depth(complex)

Tree.map(complex)(_ + 10)


Tree.sizeViaFold(simple)
Tree.sizeViaFold(complex)

Tree.maximumViaFold(simple)
Tree.maximumViaFold(complex)

Tree.depthViaFold(simple)
Tree.depthViaFold(complex)

Tree.mapViaFold(complex)(_ + 10)