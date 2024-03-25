package pl.vm.javaguild.designpatterns.pattern.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.behavioral.strategy.model.Vehicle;

@Slf4j
public class AggressiveDriving implements VehicleBehavior {
	public void perform(Vehicle vehicle) {
		System.out.println("aggressive driving");
	}
}
