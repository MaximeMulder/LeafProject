package leaf.runtime.primitive;

import java.util.List;

import leaf.runtime.Engine;
import leaf.runtime.Value;
import leaf.runtime.callable.Primitive1;

public class PrimitiveBooleanToString extends Primitive1 {
	@Override
	public void parameters(Engine engine, List<Value> parameters) {
		parameters.add(engine.getTypes().getBoolean());
	}

	@Override
	public Value execute(Engine engine, List<Value> arguments) {
		String string = "Boolean.";
		if (arguments.get(0).getData().asBoolean().getPrimitive()) {
			string += "True";
		} else {
			string += "False";
		}
		
		return engine.getValues().getString(string);
	}
}
