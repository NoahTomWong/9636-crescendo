package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;


public class IntakeIn extends Command {
    public static Intake m_intakeIn;

    public IntakeIn(Intake intakeCommand) {

        m_intakeIn = intakeCommand;

    }

    //@Override
    public void initialize2() {

        m_intakeIn.m_robotIntake(0.5);
    }

    //@Override
    public void execute2() {


    }

    //@Override
    public boolean isFinished2() {
      
      return false;
    }
  
    //@Override
    public void end2(boolean interrupted) {
      m_intakeIn.m_robotIntakeStop();
    }
}
