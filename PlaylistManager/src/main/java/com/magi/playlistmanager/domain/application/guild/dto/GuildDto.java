package com.magi.playlistmanager.domain.application.guild.dto;

import com.magi.playlistmanager.domain.core.guild.Guild;

public class GuildDto {
    
    private String id;
    private String name;
    private String iconHash;
    private DiscordServerDto discordServer;
    private String creationDate;

    public GuildDto() {

    }

    public GuildDto(String name, String iconHash, DiscordServerDto discordServer) {
        this.name = name;
        this.iconHash = iconHash;
        this.discordServer = discordServer;
    }

    public GuildDto(String id, String name, String iconHash, DiscordServerDto discordServer, String creationDate) {
        this.id = id;
        this.name = name;
        this.iconHash = iconHash;
        this.discordServer = discordServer;
        this.creationDate = creationDate;
    }

    public static GuildDto from(Guild guild) {
        DiscordServerDto discordServerDto = DiscordServerDto.from(guild.getDiscordServer());
        return new GuildDto(
            guild.getId().toString(), 
            guild.getName(), 
            guild.getIconHash(), 
            discordServerDto,
            guild.getCreationDate().toString());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconHash() {
        return iconHash;
    }

    public void setIconHash(String iconHash) {
        this.iconHash = iconHash;
    }

    public DiscordServerDto getDiscordServer() {
        return discordServer;
    }

    public void setDiscordServer(DiscordServerDto discordServer) {
        this.discordServer = discordServer;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}