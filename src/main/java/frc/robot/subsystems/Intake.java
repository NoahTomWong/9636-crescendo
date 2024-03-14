import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.SubsystemBase;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.GenericHID;
import java.lang.Object;

CANSparkMax intakeMotor;


public class Intake extends SubsystemBase {

    intakeMotor = new CANSparkMax(intakeMotorCanId, CANSparkLowLevel.MotorType kBrushless);

    public void configure() {

        //intakeMotor.configFactoryDefault();
        //intakeMotor.setNeutralMode(constIntake.NEUTRAL_MODE);
        

        public void setMotorSpeed(double speed) {
            intakeMotor.set(speed);
            
          }
        
        
          public m_robotIntakeIn() {
            setMotorSpeed(0.5);
          }


          public m_robotIntakeOut() {
            setMotorSpeed(-0.5);
          }
        }

         
        
        
      }
 


}