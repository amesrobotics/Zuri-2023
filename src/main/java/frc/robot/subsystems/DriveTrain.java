// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive.WheelSpeeds;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public DriveTrain() {}


  // H! Teleop Drive
  
  Spark frontLeftMotor = new Spark( Constants.driveTrainIDFrontLeft );
  Spark frontRightMotor = new Spark( Constants.driveTrainIDFrontRight );
  Spark backLeftMotor = new Spark( Constants.driveTrainIDBackLeft );
  Spark backRightMotor = new Spark( Constants.driveTrainIDBackRight );

  public void driveCartesian(double ySpeed, double xSpeed, double zRotation) {
    WheelSpeeds wheelSpeeds = MecanumDrive.driveCartesianIK(ySpeed, xSpeed, zRotation);

    frontLeftMotor.set( wheelSpeeds.frontLeft );
    frontRightMotor.set( wheelSpeeds.frontRight );
    backLeftMotor.set( wheelSpeeds.rearLeft );
    backRightMotor.set( wheelSpeeds.rearRight );


  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}