// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImagesImage {
    private List<String> capabilities;
    /**
     * @return When this Image was created.
     * 
     */
    private String created;
    /**
     * @return The name of the User who created this Image, or &#34;linode&#34; for official Images.
     * 
     */
    private String createdBy;
    /**
     * @return Whether or not this Image is deprecated. Will only be true for deprecated public Images.
     * 
     */
    private Boolean deprecated;
    /**
     * @return A detailed description of this Image.
     * 
     */
    private String description;
    private String expiry;
    /**
     * @return The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
     * 
     */
    private String id;
    /**
     * @return True if the Image is public.
     * 
     */
    private Boolean isPublic;
    /**
     * @return A short description of the Image.
     * 
     */
    private String label;
    /**
     * @return The minimum size this Image needs to deploy. Size is in MB. example: 2500
     * 
     */
    private Integer size;
    /**
     * @return The current status of this image. (`creating`, `pending_upload`, `available`)
     * 
     */
    private String status;
    /**
     * @return How the Image was created. Manual Images can be created at any time. &#34;Automatic&#34; Images are created automatically from a deleted Linode. (`manual`, `automatic`)
     * 
     */
    private String type;
    /**
     * @return The upstream distribution vendor. `None` for private Images.
     * 
     */
    private String vendor;

    private GetImagesImage() {}
    public List<String> capabilities() {
        return this.capabilities;
    }
    /**
     * @return When this Image was created.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return The name of the User who created this Image, or &#34;linode&#34; for official Images.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return Whether or not this Image is deprecated. Will only be true for deprecated public Images.
     * 
     */
    public Boolean deprecated() {
        return this.deprecated;
    }
    /**
     * @return A detailed description of this Image.
     * 
     */
    public String description() {
        return this.description;
    }
    public String expiry() {
        return this.expiry;
    }
    /**
     * @return The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return True if the Image is public.
     * 
     */
    public Boolean isPublic() {
        return this.isPublic;
    }
    /**
     * @return A short description of the Image.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The minimum size this Image needs to deploy. Size is in MB. example: 2500
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The current status of this image. (`creating`, `pending_upload`, `available`)
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return How the Image was created. Manual Images can be created at any time. &#34;Automatic&#34; Images are created automatically from a deleted Linode. (`manual`, `automatic`)
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The upstream distribution vendor. `None` for private Images.
     * 
     */
    public String vendor() {
        return this.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> capabilities;
        private String created;
        private String createdBy;
        private Boolean deprecated;
        private String description;
        private String expiry;
        private String id;
        private Boolean isPublic;
        private String label;
        private Integer size;
        private String status;
        private String type;
        private String vendor;
        public Builder() {}
        public Builder(GetImagesImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.created = defaults.created;
    	      this.createdBy = defaults.createdBy;
    	      this.deprecated = defaults.deprecated;
    	      this.description = defaults.description;
    	      this.expiry = defaults.expiry;
    	      this.id = defaults.id;
    	      this.isPublic = defaults.isPublic;
    	      this.label = defaults.label;
    	      this.size = defaults.size;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.vendor = defaults.vendor;
        }

        @CustomType.Setter
        public Builder capabilities(List<String> capabilities) {
            if (capabilities == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "capabilities");
            }
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }
        @CustomType.Setter
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(String createdBy) {
            if (createdBy == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "createdBy");
            }
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder deprecated(Boolean deprecated) {
            if (deprecated == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "deprecated");
            }
            this.deprecated = deprecated;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder expiry(String expiry) {
            if (expiry == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "expiry");
            }
            this.expiry = expiry;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isPublic(Boolean isPublic) {
            if (isPublic == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "isPublic");
            }
            this.isPublic = isPublic;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder vendor(String vendor) {
            if (vendor == null) {
              throw new MissingRequiredPropertyException("GetImagesImage", "vendor");
            }
            this.vendor = vendor;
            return this;
        }
        public GetImagesImage build() {
            final var _resultValue = new GetImagesImage();
            _resultValue.capabilities = capabilities;
            _resultValue.created = created;
            _resultValue.createdBy = createdBy;
            _resultValue.deprecated = deprecated;
            _resultValue.description = description;
            _resultValue.expiry = expiry;
            _resultValue.id = id;
            _resultValue.isPublic = isPublic;
            _resultValue.label = label;
            _resultValue.size = size;
            _resultValue.status = status;
            _resultValue.type = type;
            _resultValue.vendor = vendor;
            return _resultValue;
        }
    }
}
