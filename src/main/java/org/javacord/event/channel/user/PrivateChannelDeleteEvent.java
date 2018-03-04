package org.javacord.event.channel.user;

import org.javacord.entity.channel.PrivateChannel;

/**
 * A private channel delete event.
 */
public class PrivateChannelDeleteEvent extends PrivateChannelEvent {

    /**
     * Creates a new private channel delete event.
     *
     * @param channel The channel of the event.
     */
    public PrivateChannelDeleteEvent(PrivateChannel channel) {
        super(channel);
    }

}