package co.devfoundry;

class MusicPlayerRemote {
    private MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton() {
        if (musicPlayerCommand != null) {
            musicPlayerCommand.play();
        }
    }
}
