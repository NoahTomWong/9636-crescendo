import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.GenericHID;
import java.lang.Object;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import java.lang.AutoCloseable;
import com.revrobotics.CANSparkMax;


public class Intake extends SubsystemBase {

    private final CANSparkMax m_intakeMotor = new CANSparkMax(10, CANSparkLowLevel.kBrushless);


    public void setMotorSpeed(double speed) {
            m_intakeMotor.set(speed);
    }
        
        
    public void m_robotIntakeIn() {
            setMotorSpeed(0.5);
    }


    public void m_robotIntakeOut() {
            setMotorSpeed(-0.5);
        
    }        
}