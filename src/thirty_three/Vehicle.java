package thirty_three;

// 問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
public class Vehicle {

	private String owner;

	// 問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。
	public String getOwner () {
		return owner;
	}
	public void setOwner (String owner) {
		this.owner = owner;
	}


}