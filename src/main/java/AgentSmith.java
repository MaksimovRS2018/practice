import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class AgentSmith extends Agent { //наследуем
    @Override
    protected void setup() {
        System.out.println("Hello everyone. I`m "+this.getLocalName());
        addBehaviour(new TickerBehaviour(this, 2000) { //класс, который позволяет добавлять поведение
            protected void onTick() {
                System.out.println("Tick"+getLocalName());
            }
        });

    }
}
