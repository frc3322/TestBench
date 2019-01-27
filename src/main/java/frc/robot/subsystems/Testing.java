/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Testing extends Subsystem {

  DoubleSolenoid testSolenoid = new DoubleSolenoid(0, 1);

  public void toggleTestingSolenoid() {
    if(isSolenoidExtended()) {
      testSolenoid.set(DoubleSolenoid.Value.kReverse);
    }else{
      testSolenoid.set(DoubleSolenoid.Value.kForward);
    }
  }

  public boolean isSolenoidExtended() {
    return testSolenoid.get() == Value.kForward;
  }

  @Override
  public void initDefaultCommand() {
    
  }
}
