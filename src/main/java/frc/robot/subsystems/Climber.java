import edu.wpi.first.wpilibj.Solenoid;

public class ClimberModule {

    private boolean x = false;
    private boolean buttonPressed = false;
    private Solenoid m_solenoid;

    public ClimberModule(Solenoid solenoid) {
        m_solenoid = solenoid;
    }

    public void simulateButtonPress() {
        buttonPressed = false;
    }

    public boolean getCircleButtonPressed() {
        return buttonPressed;
    }

    public void togglePiston() {
        if (getCircleButtonPressed()) {
            x = !x;
            m_solenoid.set(x);
            buttonPressed = false;
        }
    }

    public static void main(String[] args) {
        Solenoid solenoid = new Solenoid(0);
        ClimberModule climberModule = new ClimberModule(solenoid);

        climberModule.simulateButtonPress();
        climberModule.togglePiston();
    }
}
