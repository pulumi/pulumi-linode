// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVolumeResult {
    /**
     * @return When this Volume was created.
     * 
     */
    private String created;
    /**
     * @return The full filesystem path for the Volume based on the Volume&#39;s label. Path is /dev/disk/by-id/scsi-0LinodeVolume + Volume label.
     * 
     */
    private String filesystemPath;
    /**
     * @return The unique ID of this Volume.
     * 
     */
    private Integer id;
    /**
     * @return This Volume&#39;s label is for display purposes only.
     * 
     */
    private String label;
    /**
     * @return If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here. If the Volume is unattached, this value will be null.
     * 
     */
    private Integer linodeId;
    /**
     * @return The datacenter in which this Volume is located. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    private String region;
    /**
     * @return The Volume&#39;s size, in GiB.
     * 
     */
    private Integer size;
    /**
     * @return The current status of the Volume. (`creating`, `active`, `resizing`, `contact_support`)
     * 
     */
    private String status;
    /**
     * @return An array of tags applied to this object.
     * 
     */
    private List<String> tags;
    /**
     * @return When this Volume was last updated.
     * 
     */
    private String updated;

    private GetVolumeResult() {}
    /**
     * @return When this Volume was created.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return The full filesystem path for the Volume based on the Volume&#39;s label. Path is /dev/disk/by-id/scsi-0LinodeVolume + Volume label.
     * 
     */
    public String filesystemPath() {
        return this.filesystemPath;
    }
    /**
     * @return The unique ID of this Volume.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return This Volume&#39;s label is for display purposes only.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here. If the Volume is unattached, this value will be null.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }
    /**
     * @return The datacenter in which this Volume is located. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The Volume&#39;s size, in GiB.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The current status of the Volume. (`creating`, `active`, `resizing`, `contact_support`)
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return An array of tags applied to this object.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return When this Volume was last updated.
     * 
     */
    public String updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String created;
        private String filesystemPath;
        private Integer id;
        private String label;
        private Integer linodeId;
        private String region;
        private Integer size;
        private String status;
        private List<String> tags;
        private String updated;
        public Builder() {}
        public Builder(GetVolumeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.filesystemPath = defaults.filesystemPath;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.linodeId = defaults.linodeId;
    	      this.region = defaults.region;
    	      this.size = defaults.size;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.updated = defaults.updated;
        }

        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder filesystemPath(String filesystemPath) {
            this.filesystemPath = Objects.requireNonNull(filesystemPath);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder linodeId(Integer linodeId) {
            this.linodeId = Objects.requireNonNull(linodeId);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public GetVolumeResult build() {
            final var _resultValue = new GetVolumeResult();
            _resultValue.created = created;
            _resultValue.filesystemPath = filesystemPath;
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.linodeId = linodeId;
            _resultValue.region = region;
            _resultValue.size = size;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.updated = updated;
            return _resultValue;
        }
    }
}
