

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.liftConstants;

public class Lift extends SubsystemBase {
  private VictorSP m_RightLiftMotor;
  private VictorSP m_LeftLiftMotor;

    public Lift() {
        m_LeftliftMotor = new VictorSP(DrivetrainConstants.LeftliftMotorPWM);
        m_rightliftMotor = new VictorSP(LiftConstants.rightliftMotorPWM);
    }

  @Override
  public void periodic() {
    
  }
}