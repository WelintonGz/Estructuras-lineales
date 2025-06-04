import controllers.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        /*Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("Tam = " + stack.size());
        stack.printStack();
        stack.pop();
        System.out.println("Tam = " + stack.size());
        stack.printStack();*/

        /*StackG<Interger> pilaG = new StackG<Interger>();
        pilaG.push(10);
        pilaG.push(8);
        pilaG.push(-1);
        pilaG.push(5);
        System.out.println("Tam = " +pilaG.size());
        pilaG.printStack();
        pilaG.pop();
        System.out.println("Tam = "+ pilaG.size());
        pilaG.printStack(); */

        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        QuequeG<Persona> colaPersonas = new QuequeG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        colaPersonas.printCola();
        System.out.println("Personaatendida -> " + colaPersonas.remove());
        colaPersonas.printCola();

        //Tam = 4
        // 8 | 5 | -1 | 10
        //Tam = 3
        // 5 | -1 | 10
    }
}
