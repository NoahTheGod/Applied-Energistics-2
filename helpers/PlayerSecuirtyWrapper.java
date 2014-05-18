package appeng.helpers;

import java.util.EnumSet;
import java.util.HashMap;

import appeng.api.config.SecurityPermissions;
import appeng.api.networking.security.ISecurityRegister;

public class PlayerSecuirtyWrapper implements ISecurityRegister
{

	final HashMap<Integer, EnumSet<SecurityPermissions>> target;

	public PlayerSecuirtyWrapper(HashMap<Integer, EnumSet<SecurityPermissions>> playerPerms) {
		target = playerPerms;
	}

	@Override
	public void addPlayer(int PlayerID, EnumSet<SecurityPermissions> permissions)
	{
		target.put( PlayerID, permissions );
	}
}