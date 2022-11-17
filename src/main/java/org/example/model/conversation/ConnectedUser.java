package org.example.model.conversation;
import org.jetbrains.annotations.NotNull;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.UUID;

public class ConnectedUser extends User {
    public String m_IP;
    public ConnectedUser(@NotNull String Pseudo,@NotNull String IP)
    {
        super(Pseudo);
        this.m_IP = IP;
    }

    public ConnectedUser (@NotNull String Pseudo, UUID uuid, @NotNull String IP)
    {
        super(Pseudo,uuid);
        this.m_IP = IP;
    }

    public String GetIP(User u) throws UnknownHostException
    {
        return this.m_IP;
    }
}
