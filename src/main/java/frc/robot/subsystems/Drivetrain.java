// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DrivetrainConstants;

public class Drivetrain extends SubsystemBase {
  private VictorSP m_frontLeftMotor;
  private VictorSP m_rearLeftMotor;
  private VictorSP m_frontRightMotor;
  private VictorSP m_rearRightMotor;

  private SpeedControllerGroup m_leftMotors;
  private SpeedControllerGroup m_rightMotors;

  private DifferentialDrive m_drive;
  
  /** Creates a new Drivetrain. */
  public Drivetrain() {
    m_frontLeftMotor = new VictorSP(DrivetrainConstants.frontLeftDriveMotorPWM);
    m_rearLeftMotor = new VictorSP(DrivetrainConstants.rearLeftDriveMotorPWM);
    m_frontRightMotor = new VictorSP(DrivetrainConstants.frontRightDrivePWM);
    m_rearRightMotor = new VictorSP(DrivetrainConstants.rearRightDrivePWM);

    m_leftMotors = new SpeedControllerGroup(m_frontLeftMotor, m_rearLeftMotor);
    m_rightMotors = new SpeedControllerGroup(m_frontRightMotor, m_rearRightMotor);

    m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);
  }

  public void tankDrive(double leftSpeed, double rightSpeed) {
    m_drive.tankDrive(leftSpeed, rightSpeed);
  }

  public void arcadeDrive(double speed, double rotation) {
    m_drive.arcadeDrive(speed, rotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Left Speed", m_leftMotors.get());
    SmartDashboard.putNumber("Right Speed", m_rightMotors.get());
  }
  
}
