package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import java.lang.AutoCloseable;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class Intake extends SubsystemBase {

    private final CANSparkMax m_intakeMotor = new CANSparkMax(10, MotorType.kBrushless);



    public void m_robotIntake(double speed) {
        m_intakeMotor.set(speed);
    }
        
    public void m_robotIntakeOut(double speed) {
        m_intakeMotor.set(speed);
    }      

    public void m_robotIntakeStop() {
        m_intakeMotor.set(0);
    }
}