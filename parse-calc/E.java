import parser.generator.code.tree.Node;

public class E extends Node {
    public double v;
    
    public E() {
    }
}
class ER extends Node {
    public double acc;
    public double v;
    
    public ER(double acc) {
    this.acc = acc;
    }
}
class TR extends Node {
    public double acc;
    public double v;
    
    public TR(double acc) {
    this.acc = acc;
    }
}
class T extends Node {
    public double v;
    
    public T() {
    }
}
class P extends Node {
    public double v;
    
    public P() {
    }
}
class PR extends Node {
    public double acc;
    public double v;
    
    public PR(double acc) {
    this.acc = acc;
    }
}
class V extends Node {
    public double v;
    
    public V() {
    }
}
