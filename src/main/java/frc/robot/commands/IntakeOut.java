package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;


public class IntakeOut extends Command {
    public static Intake m_intakeOut;

    public IntakeOut(Intake intakeCommand) {

        m_intakeOut = intakeCommand;

    }

   // @Override
    public void initialize() {

        m_intakeOut.m_robotIntake(-0.5);
    }

    //@Override
    public void execute() {


    }

    //@Override
    public boolean isFinished() {
      
      return false;
    }
  
    //@Override
    public void end(boolean interrupted) {
      m_intakeOut.m_robotIntakeStop();
    }
}