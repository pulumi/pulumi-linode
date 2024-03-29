// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetInstanceTypesTypeAddonBackup;
import java.util.List;
import java.util.Objects;


public final class GetInstanceTypesTypeAddon extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypesTypeAddon Empty = new GetInstanceTypesTypeAddon();

    @Import(name="backups", required=true)
    private List<GetInstanceTypesTypeAddonBackup> backups;

    public List<GetInstanceTypesTypeAddonBackup> backups() {
        return this.backups;
    }

    private GetInstanceTypesTypeAddon() {}

    private GetInstanceTypesTypeAddon(GetInstanceTypesTypeAddon $) {
        this.backups = $.backups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypesTypeAddon defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypesTypeAddon $;

        public Builder() {
            $ = new GetInstanceTypesTypeAddon();
        }

        public Builder(GetInstanceTypesTypeAddon defaults) {
            $ = new GetInstanceTypesTypeAddon(Objects.requireNonNull(defaults));
        }

        public Builder backups(List<GetInstanceTypesTypeAddonBackup> backups) {
            $.backups = backups;
            return this;
        }

        public Builder backups(GetInstanceTypesTypeAddonBackup... backups) {
            return backups(List.of(backups));
        }

        public GetInstanceTypesTypeAddon build() {
            if ($.backups == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeAddon", "backups");
            }
            return $;
        }
    }

}
