 // Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Camera extends SubsystemBase {
  CameraServer M_CameraServer;
  /** Creates a new Camera. */
  public Camera() {
   M_CameraServer = CameraServer.getInstance();
  }

  public void smartDisplay() { 
    M_CameraServer.startAutomaticCapture();
  }

  @Override
  public void periodic() {

    
  }
}
