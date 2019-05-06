$input v_view, v_position, v_normal, v_color, v_uv0, v_uv1, v_light

#include <encode.sh>
#include <pbr/pbr.sh>
#include <pbr/light.sh>
#define BRDF_LAMBERT
#include <pbr/light_brdf_three.sh>
#include <pbr/radiance.sh>
#include <fog.sh>

void main()
{
#include "fs_fragment.sh"

#include "fs_phong_material.sh"
    PhongMaterial material = matphong;

#ifdef DEFERRED
    #include "fs_out_gbuffer.sh"
#else
    #include "fs_lambert.sh"
    #include "fs_out_pbr.sh"
    #include "fs_fog_simple.sh"
#endif
}
